def predict_price_range_func():

    # importing the libraries
    import os
    import pandas as pd
    import joblib
    import sys

   # get the last string which is contains the device data separated by "," in string format
    device_data = sys.argv[-1]
    # features list in format of string.
    features = device_data.split(',')
    # get the absolute path the project directory
    project_path = os.path.abspath(os.path.join("." ,".."))
    # load the model
    LogisticRegressionModel = joblib.load(f'{project_path}\\data\\savings\\LogisticRegressionModel.joblib')
    # define the list that contains the columns names
    columns_names = ['battery_power', 'blue', 'clock_speed', 'dual_sim', 'fc', 'four_g',
                    'int_memory', 'm_dep', 'mobile_wt', 'n_cores', 'pc', 'px_height',
                    'px_width', 'ram', 'sc_h', 'sc_w', 'talk_time', 'three_g',
                    'touch_screen', 'wifi']
    # define the list that contains the type of every column
    cols_types = ["int", "int", "float", "int", "int", "int", "int", "float", "int", "int",
                  "int", "int", "int", "int", "int", "int", "int", "int", "int", "int"]
    # create dictionary of column names and it's types
    cols_types = dict(zip(columns_names, cols_types))
    # create dataframe with the defined columns and types
    device_to_predict_price = pd.DataFrame(data=[pd.to_numeric(features)], columns=columns_names).astype(cols_types)
    # get the model prediction of the device features
    price_range_prediction = LogisticRegressionModel.predict(device_to_predict_price)[0]
    #print(str(price_range_prediction))
    # return the output
    return str(price_range_prediction)

if __name__ == "__main__":

    price_range_prediction = predict_price_range_func()
#python predict_price_range_func.py 1807.0 1.0 2.8 0.0 1.0 0.0 27.0 0.9 186.0 3.0 4.0 1270.0 1366.0 2396.0 17.0 10.0 10.0 0.0 1.0 1.0