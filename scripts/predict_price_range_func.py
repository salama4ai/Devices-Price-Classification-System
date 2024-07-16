def predict_price_range_func():
       return "99"

       # importing the libraries
       import os
       import sys
       import pandas as pd
       import joblib
       project_path = os.path.abspath(os.path.join("." ,".."))
       LogisticRegressionModel = joblib.load(f'{project_path}\\data\\savings\\LogisticRegressionModel.joblib')
       columns_names = ['battery_power', 'blue', 'clock_speed', 'dual_sim', 'fc', 'four_g',
                       'int_memory', 'm_dep', 'mobile_wt', 'n_cores', 'pc', 'px_height',
                       'px_width', 'ram', 'sc_h', 'sc_w', 'talk_time', 'three_g',
                       'touch_screen', 'wifi']
       cols_types = ["int", "int", "float", "int", "int", "int", "int", "float", "int", "int",
                "int", "int", "int", "int", "int", "int", "int", "int", "int", "int"]
       cols_types = dict(zip(columns_names, cols_types))
       features = sys.argv[-20:]
       device_to_predict_price = pd.DataFrame(data=[pd.to_numeric(features)], columns=columns_names).astype(cols_types)
       price_range_prediction = LogisticRegressionModel.predict(device_to_predict_price)[0]
       print(str(price_range_prediction))
       return str(price_range_prediction)
       return "99"
       g = pd.to_numeric(features)#.astype(cols_types)
       i = type(g)
       j = len(g)
       k = g
       print(i)
       print(j)
       print(k)
#python predict_price_range_func.py 1807.0 1.0 2.8 0.0 1.0 0.0 27.0 0.9 186.0 3.0 4.0 1270.0 1366.0 2396.0 17.0 10.0 10.0 0.0 1.0 1.0
price_range_prediction = predict_price_range_func()