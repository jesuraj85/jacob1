#!/usr/bin/python
import sqlite3
import pandas as pd
import pyodbc

df=pd.read_excel('C:\\Users\\Cyntexia\\Desktop\\Pycharm\\sample.xls')
print(df.dtypes)
with open('C:\\Users\\Cyntexia\\Desktop\\Pycharm\\test.csv', 'wt') as f:
    f.write(',' + ','.join(map(str, df.dtypes)) + '\n')
    df.to_csv(f, line_terminator='\n')

conn = pyodbc.connect(r'Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\Users\\Cyntexia\\Desktop\\Pycharm\\sam.accdb;')
filename="script"
wb=pd.read_excel('C:\\Users\\Cyntexia\\Desktop\\Pycharm\\sample1.xls')
for sheet in wb:

    DBFile = r'C:\Users\Cyntexia\Desktop\Pycharm\sam.accdb'
    exFile = r'C:\Users\Cyntexia\Desktop\Pycharm\sample.xls'

    conn = pyodbc.connect('DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ='+DBFile)

    # APPEND TO LOCAL TABLE
    sql = """SELECT * INTO myNewTable FROM [Excel 12.0 Xml; HDR=Yes; Database={myfile}].[Orders$]
          """

    curs = conn.cursor()
    curs.execute(sql.format(myfile = exFile))
conn.commit()