from flask import Flask,render_template
from flask_restful import Api, Resource, reqparse

app = Flask(__name__)
api = Api(app)

# Store submitted data (replace this with your data storage mechanism)
submitted_data = []

# Request parser for parsing JSON data from the request
parser = reqparse.RequestParser()
parser.add_argument('name', type=str, required=True)
parser.add_argument('email', type=str, required=True)

class SubmitFormResource(Resource):
    def post(self):
        args = parser.parse_args()
        data = {
            'name': args['name'],
            'email': args['email']
        }
        submitted_data.append(data)  # Store the data (you can replace this with database logic)
        return {'message': 'Form submitted successfully'}

# Add the resource to the API with the appropriate route
api.add_resource(SubmitFormResource, '/api/submit')
@app.route('/api/submit',methods=["GET"])
def login():
    return render_template('form.html')

if __name__ == '__main__':
    app.run(debug=True)

