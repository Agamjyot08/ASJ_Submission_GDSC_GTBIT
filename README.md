# Android Study Jams- GDSC Guru Tegh Bahadur Institute of Technology, Delhi

## Problem Statement
Food is the best mood changer, and that's what we as Indians think of whenever there is a good weather outside, don't we? 
There is nothing technology can't do! So, something like a mobile application could provide a solution to this. 

## Proposed Solution & Screenshots
How great would it be if there is a pleasant weather outside and you get to know the best recipes for the weather? This app does that. Our application recommends food on the basis of the weather at the user's location. We also thought of recommending the popular food recipes based on the user's current location, and hence, came up with a solution for that too. The app recommends dishes, both on the basis of weather and location, as well as shows teh recipes for each using youtube videos.

<img width="824" alt="2022-01-10" src="https://user-images.githubusercontent.com/56999226/148780626-15a8b6d5-741a-493f-81e6-b9fcb5325e2b.png">
<img width="653" alt="2022-01-10 (1)" src="https://user-images.githubusercontent.com/56999226/148780644-58161b7d-5c0d-4725-97e3-0533c340b0c9.png">

Screenshots Drive Link: https://drive.google.com/drive/folders/12ALjjzdqMhwyz5oTU0QCCMBrZD8SdNAD?usp=sharing

## Functionality & Concepts Used:
* The app has a pretty basic user interface, a Bottom NavBar that helps users navigate through the Profile, Weather and Location fragment.
* Relative Layout : We used relative layout for all our fragments.
* RecyclerView : To display the list of different food items, we used RecyclerView.
* Retrofit: We used some publically available APIs such as Weather Stack and OpenWeatherMap API, used them to extract the required data into our own created API endpoints, to use in the application.
* LiveData & Room Database : We are also using LiveData to update & observe any changes in the user's location or weather, Recipes can also be added to your favorites! To save those dishes you like, just tap the heart button on any dish and the dish is stored in your favorites using Room Database.
* Firebase: For user signup and sign-in.

## Application Link and Future Scope
Link: https://drive.google.com/file/d/1Paa6rW8JotnSOoxH-JDbSbF--Q54Iyxv/view?usp=sharing

Scope:
* Want to have something special but don't have the ingredients for that? We got you! Just order ingredients you need for cooking your dish, or tap the "Order" button and get the dish delivered to you!
* Reaching out to the local retailers and home cooks, helping them grow and earn, as we aim to build a good business model.
