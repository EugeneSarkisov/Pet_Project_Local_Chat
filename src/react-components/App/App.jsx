import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Header } from "../header/header";
import { MainPage } from "../main-page/main-page";
import { NotFound } from "../not-found/not-found";
import { ChatPage } from "../chat-page/chat-page";

// import './App.css';


function App() {
  return (
    <BrowserRouter>
    <Header/>
    <Routes>
            <Route path="/" element={<MainPage/>}/>
            <Route path="*" element={<NotFound/>}/>
            <Route path="/chat" element={<ChatPage/>}/>
   </Routes>
    </BrowserRouter>
  );
}

export default App;
