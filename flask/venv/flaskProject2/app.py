from flask import Flask, render_template, request, flash
from flask_sqlalchemy import SQLAlchemy
import pymysql

app = Flask(__name__)
app.app_context().push()
app.secret_key = 'login'
app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+pymysql://root:123456@127.0.0.1:3306/login'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
db = SQLAlchemy(app)


@app.route('/')
def hello():
    users = User.query.get(1)
    hel = 'hello world'
    return render_template("test.html", users=users)


class User(db.Model):
    __tablename__ = 'user'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    username = db.Column(db.String(100))
    password = db.Column(db.String(100))


class Haxi(db.Model):
    __tablename__ = 'haxi'
    id = db.Column(db.BigInteger, primary_key=True, autoincrement=True)
    ha = db.Column(db.String(100))
class Data(Resource):
    __tablename__ = 'datas'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    user = db.Column(db.String(100))
    eng = db.Column(db.String(100))
    chn = db.Column(db.String(100))
    pho = db.Column(db.String(100))
    sen1 = db.Column(db.String(100))
    sen2 = db.Column(db.String(100))


db.create_all()
db.session.commit()


db.create_all()


@app.route('/add')
def add():
    user = User(username='zhangsan', password='1234')
    db.session.add(user)
    db.session.commit()
    return "添加成功"


if __name__ == '__main__':
    app.run()
