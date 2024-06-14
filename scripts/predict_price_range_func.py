def predict_price_range_func():
       # importing the libraries
       import os
       import sys
       import pandas as pd
       import joblib
       project_path = os.path.abspath(os.path.join("." ,"../.."))
       LogisticRegressionModel = joblib.load(f'{project_path}/data/savings/LogisticRegressionModel.joblib')
       columns_names = ['battery_power', 'blue', 'clock_speed', 'dual_sim', 'fc', 'four_g',
                       'int_memory', 'm_dep', 'mobile_wt', 'n_cores', 'pc', 'px_height',
                       'px_width', 'ram', 'sc_h', 'sc_w', 'talk_time', 'three_g',
                       'touch_screen', 'wifi']
       types = ["int", "int", "float", "int", "int", "int", "int", "float", "int", "int",
                "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", ]
       cols_types = dict(zip(columns_names, cols_types))
       features = [sys.args[1:]]
       device_to_predict_price = pd.DataFrame(data=features, columns=columns_names).astype(cols_types)
       #return price_range_prediction

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
predict_price_range_func()