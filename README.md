# NavigationExample

**NavigationExample** is a modern Android application built with [Jetpack Compose](https://developer.android.com/jetpack/compose) and the Navigation component. It demonstrates a robust, modular, and type-safe architecture to manage multiple screens with custom animated transitions.

## Overview

NavigationExample showcases best practices for implementing smooth and dynamic screen transitions using Jetpack Compose. The app features:

- **Custom Animated Transitions:** Each screen transition is animated with slide effects, providing an engaging user experience.
- **Reusable UI Components:** A consistent layout is maintained across screens with a custom `AppScaffold` that integrates a top app bar.
- **Type-Safe Navigation:** Navigation routes are defined using sealed classes to enhance code safety and maintainability.
- **Modern UI Design:** The application follows Material3 design principles with a custom theme and a well-organized code structure.

## Project Structure

- **components:** Contains the reusable `AppScaffold` component that provides a consistent layout with a top app bar.
- **navigation:** Manages the navigation graph, including route definitions and custom transition animations.
- **screen:** Includes individual composable screens (Home, Up, Down, Left, Right) that demonstrate different navigation scenarios.
- **ui.theme:** Defines the application's color scheme and theme settings using Material3.

## Getting Started

To run the application:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/AlexisZhuber/NavigationExample.git
   ```
2. **Open in Android Studio:**  
   Import the project into Android Studio.
3. **Build and Run:**  
   Compile the project and run it on an emulator or a physical device.

For a comprehensive, step-by-step tutorial on how the navigation is implemented with Jetpack Compose, please visit the detailed post on my [blog](https://yourbloglink.com).

## Built With

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
- [Material3](https://m3.material.io/)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
