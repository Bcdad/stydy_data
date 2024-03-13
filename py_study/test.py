from flask import Flask, render_template, url_for, redirect, request, flash
from flask_sqlalchemy import SQLAlchemy
app=Flask(__name__)
HOSTNAME='127.0.0.1'
PORT=3306
USERNAME='root'
PASSWORD='123456'
DATEBASE='LEARN'
app.config['SQLALCHEMY_DATABASE_URI']=f"mysql+pymysql://{USERNAME}:{PASSWORD}@{HOSTNAME}:{PORT}/{DATEBASE}?charest=utf8"
db=SQLAlchemy(app)
with db.engine.connect() as conn:
    rs=conn.execute("select 1")
    print(rs.fetchone())