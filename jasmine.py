# Demand prediction using average of past sales (no external libraries)

# Sample past 7 days sales data (can be modified)
sales_data = [50, 55, 53, 60, 62, 58, 65]

# Function to calculate average sales
def predict_next_day_demand(data):
    if len(data) == 0:
        return 0
    total = 0
    for value in data:
        total += value
    average = total / len(data)
    return int(round(average))

# Predict demand
predicted_demand = predict_next_day_demand(sales_data)

# Display results
print("Past Sales Data:", sales_data)
print("Predicted Demand for Next Day:", predicted_demand)
