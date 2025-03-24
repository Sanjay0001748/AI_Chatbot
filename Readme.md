# AI Chatbot (Sanjay) - Google Gemini API & Spring Boot

## 🚀 Overview
AI Chatbot **Sanjay** is an intelligent chatbot built using **Google Gemini API** and **Java Spring Boot**. It provides AI-powered conversational capabilities by leveraging Google's advanced NLP models.

## 🛠️ Features
- 🤖 AI-powered chatbot using Google Gemini API
- 🏗️ Built with Java Spring Boot
- 🌐 REST API for chat interactions
- 🔑 Secure API key integration
- ⚡ Fast and scalable architecture

## 📌 Prerequisites
Ensure you have the following installed:

- **Java 17+** → [Download](https://adoptium.net/)
- **Maven 3+** → [Download](https://maven.apache.org/download.cgi)
- **Google Gemini API Key** → [Get from AI Studio](https://aistudio.google.com/)
- **Git** → [Download](https://git-scm.com/downloads)
- **Gradle** -> [Download](https://gradle.org/releases/)

## 🚀 Installation & Setup

### 1️⃣ Clone the Repository
```sh
 git clone git@github.com:yashwanthm3012/AI_Chatbot_Sanjay.git
 cd AI_Chatbot_Sanjay
```

### 2️⃣ Configure API Key
Set up your **Google Gemini API Key** inside `src/main/resources/application.properties`:
```properties
gemini.api.key=your_api_key_here
```
Or use environment variables:
```sh
export GEMINI_API_KEY="your_api_key_here"
```

### 3️⃣ Build & Run
For **Maven**:
```sh
mvn clean install
mvn spring-boot:run
```
For **Gradle**:
```sh
./gradlew bootRun
```

## 🎯 Usage
Once the chatbot is running, test it via **Postman** or **cURL**:
```sh
curl -X POST "http://localhost:8080/chat" -H "Content-Type: application/json" -d '{"message": "Hello, AI!"}'
```

## 🛠️ API Endpoints
| Method | Endpoint       | Description          |
|--------|--------------|----------------------|
| `POST` | `/chat`       | Sends a message to the AI chatbot |

## 🚀 Deployment
To deploy the chatbot on a **server**, you can create a JAR file and run it:
```sh
mvn package
java -jar target/ai-chatbot-sanjay.jar
```

## 📝 License
This project is **open-source** and available under the MIT License.

---
### ✨ Contribute & Support
Feel free to **contribute**, **report issues**, or suggest features! Reach out via [GitHub Issues](https://github.com/yashwanthm3012/AI_Chatbot_Sanjay/issues). 🚀