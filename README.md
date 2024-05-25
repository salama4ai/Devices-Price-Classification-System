# Devices-Price-Classification-System
Devices Price Classification System (AI System) using Python and SpringBoot.

```
Project Attachements - AI Developer
Devices Price Classification System
using Python and Spring Boot

Project Description:
Build a Devices Price Classification System (AI System) using Python and SpringBoot. Mainly
the system will include two small projects:
● Python project: will allow you to predict the prices, allowing the sellers to classify the device's prices according to their characteristics
● SpringBoot project: Will contain a simple entity, and a few endpoints, to call the service
from the Python project for a bunch of test cases, and store them.

Advice and Guidance (Evaluation Criteria):
● Focus on the requirements and the questions (since they are the most weighted things here).
● We are going in-depth in the details, so we highly recommend not applying any algorithm or concept if it is not suitable for your case. Include comments on each algorithm or concept applied to articulate the rationale behind your choices and decisions.

● Documentation: Provide clear documentation on how to run the application, interact with API endpoints.
● Code Quality: Evaluate the code for readability, maintainability, and adherence to best
practices

Python Project
DataSet: Devices specifications:
○ Train Data: TRAIN DATASET LINK
○ Test Data: TEST DATASET LINK

Dataset columns are as follows:
■ id - ID
■ battery_power - Total energy a battery can store in one time measured in mAh
■ blue - Has Bluetooth or not
■ clock_speed - The speed at which the microprocessor executes instructions
■ dual_sim - Has dual sim support or not
■ fc - Front Camera megapixels
■ four_g - Has 4G or not
■ int_memory - Internal Memory in Gigabytes
■ m_dep - Mobile Depth in cm
■ mobile_wt - Weight of mobile phone
■ n_cores - Number of cores of the processor
■ pc - Primary Camera megapixels
■ px_height - Pixel Resolution Height
■ px_width - Pixel Resolution Width
■ ram - Random Access Memory in Megabytes
■ sc_h - Screen Height of mobile in cm
■ sc_w - Screen Width of mobile in cm
■ talk_time - longest time that a single battery charge will last when you are
■ three_g - Has 3G or not
■ touch_screen - Has touch screen or not
■ wifi - Has wifi or not
■ price_range - This is the target variable with the value of:
● 0 (low cost)
● 1 (medium cost)
● 2 (high cost)
● 3 (very high cost)

Modeling Steps:
● Do the following operations, to build your own ML model, to predict or classify the price for any device:

Data Preparing:
■ Do your best to prepare the data very well, and do some engineering processing, add your comments.
○ EDA.(Show 1-2 insights, add your comments)
■ Select and illustrate appropriate charts for your dataset to facilitate
the discovery of patterns, insights, and correlations. (Add your comments)
○ Train using an appropriate algorithm. (Add your comments)

Evaluate your model:
■ Show some evaluation metrics.(confusion matrix, or any other metrics, Add your comments).

Optimize your model:
■ Choose an appropriate algorithm to make your result good enough.(Add your comments).

● Endpoints:
○ RESTful API to predict the price for any device:
■ Will take the specs for any device, and send it to your ML model, then return the predicted price.

SpringBoot Project Entities:
● Device: to describe every device in our system.

EndPoints: Implement RESTful endpoints to handle the following operations
● POST /api/devices/: Retrieve a list of all devices
● GET /api/devices/{id}: Retrieve details of a specific device by ID.
● POST /api/devices: Add a new device.
● POST /api/predict/{deviceId}
○ This will call the Python API to predict the price, and save the result in the device entity here.
○ Apply some best practices here, like transaction management.

Testing:
● Do prediction for 10 devices from the Test dataset above.

DataStorage:
● It's not a big deal, choose any kind of Database.

Please make sure the project repo is public.

Best Of Luck```