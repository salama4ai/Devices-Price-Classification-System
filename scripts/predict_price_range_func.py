def predict_price_range_func():
       # importing the libraries
       import os
       import sys
       import pandas as pd
       import joblib

       test = [[1546.0, 0.0, 0.5, 1.0, 18.0, 1.0, 25.0, 0.5, 96.0, 8.0, 20.0, 295.0, 1752.0, 3893.0, 10.0, 0.0, 7.0, 1.0, 1.0, 0.0]
       ,[1434.0, 0.0, 1.4, 0.0, 11.0, 1.0, 49.0, 0.5, 108.0, 6.0, 18.0, 749.0, 810.0, 1773.0, 15.0, 8.0, 7.0, 1.0, 0.0, 1.0]
       ,[1464.0, 1.0, 2.9, 1.0, 5.0, 1.0, 50.0, 0.8, 198.0, 8.0, 9.0, 569.0, 939.0, 3506.0, 10.0, 7.0, 3.0, 1.0, 1.0, 1.0]
       ,[1718.0, 0.0, 2.4, 0.0, 1.0, 0.0, 47.0, 1.0, 156.0, 2.0, 3.0, 1283.0, 1374.0, 3873.0, 14.0, 2.0, 10.0, 0.0, 0.0, 0.0]
       ,[833.0, 0.0, 2.4, 1.0, 0.0, 0.0, 62.0, 0.8, 111.0, 1.0, 2.0, 1312.0, 1880.0, 1495.0, 7.0, 2.0, 18.0, 0.0, 1.0, 1.0]
       ,[1111.0, 1.0, 2.9, 1.0, 9.0, 1.0, 25.0, 0.6, 101.0, 5.0, 19.0, 556.0, 876.0, 3485.0, 11.0, 9.0, 10.0, 1.0, 1.0, 0.0]
       ,[1520.0, 0.0, 0.5, 0.0, 1.0, 0.0, 25.0, 0.5, 171.0, 3.0, 20.0, 52.0, 1009.0, 651.0, 6.0, 0.0, 5.0, 1.0, 0.0, 1.0]]

       project_path = os.path.abspath(os.path.join("." ,".."))
       LogisticRegressionModel = joblib.load(f'{project_path}\\data\\savings\\LogisticRegressionModel.joblib')
       columns_names = ['battery_power', 'blue', 'clock_speed', 'dual_sim', 'fc', 'four_g',
                       'int_memory', 'm_dep', 'mobile_wt', 'n_cores', 'pc', 'px_height',
                       'px_width', 'ram', 'sc_h', 'sc_w', 'talk_time', 'three_g',
                       'touch_screen', 'wifi']
       cols_types = ["int", "int", "float", "int", "int", "int", "int", "float", "int", "int",
                "int", "int", "int", "int", "int", "int", "int", "int", "int", "int"]
       cols_types = dict(zip(columns_names, cols_types))
       features = [test[0]]
       print(features)
       #features = [sys.args[:-1]]
       device_to_predict_price = pd.DataFrame(data=features, columns=columns_names).astype(cols_types)
       price_range_prediction = LogisticRegressionModel.predict(device_to_predict_price)
       print(price_range_prediction)
       return price_range_prediction
       #return "99"




       #device_to_predict_price.loc[-1] = args
       i = type(features)
       j = len(features)
       k = features
       print(i)
       print(j)
       print(k)
       return str(i), str(j), str(k)
       return str(i)
       return str(j)
       return str(k)
price_range_prediction = predict_price_range_func()