from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import classification_report

# Sample training data
texts = [
    "You're an idiot",
    "I hate you so much",
    "You're so stupid",
    "You are amazing",
    "Have a great day",
    "You are my best friend",
    "Go kill yourself",
    "You're worthless",
    "I love your energy",
    "You are a nice person"
]
labels = [1, 1, 1, 0, 0, 0, 1, 1, 0, 0]  # 1 = Cyberbullying, 0 = Not

# Step 1: Vectorize text
vectorizer = TfidfVectorizer()
X = vectorizer.fit_transform(texts)

# Step 2: Split data
X_train, X_test, y_train, y_test = train_test_split(X, labels, test_size=0.3, random_state=42)

# Step 3: Train the model
model = LogisticRegression()
model.fit(X_train, y_train)

# Step 4: Evaluate model
y_pred = model.predict(X_test)
print("=== Classification Report ===")
print(classification_report(y_test, y_pred))

# Step 5: Get input from user
user_input = input("Enter a social media comment: ")

# Step 6: Predict
user_vector = vectorizer.transform([user_input])
prediction = model.predict(user_vector)[0]

# Step 7: Show result
print("\nPrediction:", "Cyberbullying ❌" if prediction == 1 else "Not Cyberbullying ✅")
