from flask import Flask, request
application = Flask(__name__)

qDepth = 100

@application.route("/")
def hello():
    return "This is the metric app"

@application.route("/setdepth")
def setQueueDepth():
    global qDepth 
    qDepth = request.args.get('size')
    return str(qDepth)

@application.route("/getdepth")
def getQueueDepth():
    return str(qDepth)

@application.route("/resetdepth")
def resetQueueDepth():
    global qDepth 
    qDepth = 100
    return str(qDepth)

if __name__ == "__main__":
    application.run()
