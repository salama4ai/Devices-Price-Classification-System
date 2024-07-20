def predict_price_range_func():
    #return "973"
    # importing the libraries
    import os
    import pandas as pd
    import joblib
    import sys


    # Doing exec() on this file will alter the current interpreter's
    # environment so you can import libraries in the virtualenv
    # activate_this_file = "/path/to/virtualenv/bin/activate_this.py"
    # python_bin = os.path.abspath(path="C:\\Users\\All\\miniconda3\\envs\\venv\\python")
    # exec(open(python_bin).read(), {'__file__': python_bin})

    device_data = sys.argv[-1]
    features = list(map(float, device_data.split(',')))
    #print(features)

    project_path = os.path.abspath(os.path.join("." ,".."))
    LogisticRegressionModel = joblib.load(f'{project_path}\\data\\savings\\LogisticRegressionModel.joblib')
    columns_names = ['battery_power', 'blue', 'clock_speed', 'dual_sim', 'fc', 'four_g',
                    'int_memory', 'm_dep', 'mobile_wt', 'n_cores', 'pc', 'px_height',
                    'px_width', 'ram', 'sc_h', 'sc_w', 'talk_time', 'three_g',
                    'touch_screen', 'wifi']
    cols_types = ["int", "int", "float", "int", "int", "int", "int", "float", "int", "int",
             "int", "int", "int", "int", "int", "int", "int", "int", "int", "int"]
    cols_types = dict(zip(columns_names, cols_types))
    device_to_predict_price = pd.DataFrame(data=[pd.to_numeric(features)], columns=columns_names).astype(cols_types)
    price_range_prediction = LogisticRegressionModel.predict(device_to_predict_price)[0]
    print(str(price_range_prediction))
    return str(price_range_prediction)

if __name__ == "__main__":

    price_range_prediction = predict_price_range_func()
#python predict_price_range_func.py 1807.0 1.0 2.8 0.0 1.0 0.0 27.0 0.9 186.0 3.0 4.0 1270.0 1366.0 2396.0 17.0 10.0 10.0 0.0 1.0 1.0