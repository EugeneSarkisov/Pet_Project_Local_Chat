import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Header } from "../header/header";
import { MainPage } from "../main-page/main-page";
import { NotFound } from "../not-found/not-found";
import { ChatPage } from "../chat-page/chat-page";
import { Signin } from "../sign-in/sign-in"
import { Tryagain } from "../sign-in/sign-in";
import { Success } from "../sign-in/sign-in";
import { SignUp } from "../sign-up/sign-up";
import { Confirmation } from "../sign-up/sign-up";

// import './App.css';


function App() {
  return (
    <BrowserRouter>
    <Header/>
    <Routes>
            <Route path="/" element={<MainPage/>}/>
            <Route path="*" element={<NotFound/>}/>
            <Route path="/chat" element={<ChatPage/>}/>
            <Route path="/signin" element={<Signin/>}/>
            <Route path="/signup" element={<SignUp/>}/>
            <Route path="/tryagain" element={<Tryagain/>}/>
            <Route path="/confirmation" element={<Confirmation/>}/>
            <Route path="/success" element={<Success/>}/>
   </Routes>
    </BrowserRouter>
  );
}

export default App;
