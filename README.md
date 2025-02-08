# Hungarian Word Lock Screen App

## Overview
The Hungarian Word Lock Screen App is designed to help users learn Hungarian vocabulary directly from their device's lock screen. The app displays Hungarian words along with their Turkish translations, allowing users to enhance their language skills effortlessly.

## Features
- **Lock Screen Functionality**: Users can view Hungarian words and their Turkish counterparts without unlocking their phones.
- **Customizable Word Display**: Users can adjust the frequency of word changes (e.g., every 30 seconds, 1 minute, or 5 minutes).
- **Extensive Word Database**: The app includes a vast vocabulary of Hungarian words, with the option for users to add new words and mark favorites for frequent display.
- **User-Friendly Interface**: The app features a sleek design with a black background and white text, ensuring readability.
- **Performance Optimized**: The app runs in the background without affecting device performance and adheres to Android's security policies.

## Architecture
The application follows the MVVM (Model-View-ViewModel) architecture:
- **Model**: Manages the data source (local database or API).
- **View**: Represents the user interface.
- **ViewModel**: Manages UI data and business logic.

## Technologies Used
- **Programming Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Database**: Room
- **Background Processing**: WorkManager
- **Data Flow**: LiveData & Flow
- **Dependency Injection**: Hilt/Dagger
- **Security**: Complies with Android security policies for lock screen functionality.

## Getting Started
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/HungarianWordLockScreenApp.git
   ```
2. Open the project in your preferred IDE.
3. Build and run the application on an Android device or emulator.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.