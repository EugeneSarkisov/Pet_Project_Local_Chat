import React, { useState, useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import "./styles.css"

export const ChatPage = ({}) => {
    // const deliverMessage
    return (
        <section className ='chat-chatpage'>
            <div className ='container-chatpage'>
                <div className='container-chatpage-chat-window'></div>
                <div className='container-chatpage-chat-workspace'>
                <input className='container-chatpage-chat-input' type="text" placeholder="Введите сообщение..."></input>
                <button className='chat-send-button'> Отправить </button>
                </div>
            </div>
            </section>
    )
}