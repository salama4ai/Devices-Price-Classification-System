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
       #device_to_predict_price = pd.DataFrame(columns=columns_names)
       #device_to_predict_price.loc[-1] = argv
       device_to_predict_price = pd.Series({name: val for name, val in zip(columns_names, sys.argv)})
       price_range_prediction = LogisticRegressionModel.predict(device_to_predict_price)
       return price_range_prediction
predict_price_range_func()