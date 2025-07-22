# Simple cyberbullying detection using keyword matching

# List of bullying-related keywords
cyberbullying_keywords = [
    "idiot", "hate", "stupid", "kill", "worthless", "dumb", "loser",
    "ugly", "shut up", "moron", "freak", "fat", "nobody likes you"
]

# Convert to lowercase for easier matching
cyberbullying_keywords = [word.lower() for word in cyberbullying_keywords]

# Get input from user
user_input = input("Enter a social media comment: ").lower()

# Check if any keyword is in the user input
is_bullying = False
for word in cyberbullying_keywords:
    if word in user_input:
        is_bullying = True
        break

# Print result
if is_bullying:
    print("⚠️ Cyberbullying detected!")
else:
    print("✅ No cyberbullying detected.")
