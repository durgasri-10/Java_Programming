# Sample data: student name and progress percentage
students = [
    {"name": "Alice", "progress": 80},
    {"name": "Bob", "progress": 60},
    {"name": "Charlie", "progress": 90},
    {"name": "Durgasri", "progress": 75},
    {"name": "Eve", "progress": 50}
]

# Initialize variables
total_progress = 0
highest = students[0]
lowest = students[0]

# Process each student's progress
for student in students:
    progress = student["progress"]
    total_progress += progress

    if progress > highest["progress"]:
        highest = student

    if progress < lowest["progress"]:
        lowest = student

# Calculate average
average_progress = total_progress / len(students)

# Display results
print("E-Learning Progress Report")
print("---------------------------")
print("Average Progress:", average_progress, "%")
print("Highest Progress:", highest["name"], "-", highest["progress"], "%")
print("Lowest Progress :", lowest["name"], "-", lowest["progress"], "%")
