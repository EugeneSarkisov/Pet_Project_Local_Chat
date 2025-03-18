import React, { useState, useEffect } from 'react';
 import "./styles.css";
// import { Link } from "react-router-dom";
import plusCircle from './main-page-button-svg/plusCircle.svg';
import { Modal } from '../modal/modal';

export const MainPage = ({}) => {

// const openChat = () => {
//     addEventListener.onClick()
// };
const [isModalOpen, setModalOpen] = useState(false);

const openModal = () => {
    setModalOpen(true);
};

const closeModal = () => {
    setModalOpen(false);
};


    return (
        <section className ='chat-mainpage'>
            <div className ='container-mainpage'>
                <div className ='container-box-chat-list'>
                    <ul className ='chat-list'>
                        <li className='chat'>
                            <div className='chat-name'> Ебу собак </div>
                            <div className='chat-stats'>
                            <div className='chat-actual-members'> 12/ </div>
                            <div className='chat-max-members'>  10 </div>
                            </div>
                            </li>
                        <li className='chat'>
                            <div className='chat-name'> Всегда готов </div>
                            <div className='chat-stats'>
                            <div className='chat-actual-members'> 6/ </div>
                            <div className='chat-max-members'>  9 </div>
                            </div>
                            </li>
                        <li className='chat'>
                            <div className='chat-name'> Сразу трахнуть </div>
                            <div className='chat-stats'>
                            <div className='chat-actual-members'> 3/ </div>
                            <div className='chat-max-members'>  4 </div>
                            </div>
                            </li>
                        <li className='chat'>
                            <div className='chat-name'> Несколько котов </div>
                            <div className='chat-stats'>
                            <div className='chat-actual-members'> 14/ </div>
                            <div className='chat-max-members'>  88 </div>
                            </div>
                            </li>
                        <li className='chat'>
                            <div className='chat-name'> Ты мне ничего не говори </div>
                            <div className='chat-stats'>
                            <div className='chat-actual-members'> 9/ </div>
                            <div className='chat-max-members'> 11 </div>
                            </div>
                            </li>
                        <li className='chat'>
                            <div className='chat-name'> Лучше мне собачку подари </div>
                            <div className='chat-stats'>
                            <div className='chat-actual-members'> 0/ </div>
                            <div className='chat-max-members'> 0 </div>
                            </div>
                            </li>
                    </ul>
                    
                </div>
            </div>
            <div className='chat-mainpage-add-chat'>
            {!isModalOpen && (
                <img 
                    src={plusCircle} 
                    alt="Open Modal" 
                    className="svg-button" 
                    onClick={openModal} 
                    style={{ cursor: 'pointer', position: 'fixed', bottom: '20px', right: '20px', width: '50px', height: '50px' }} 
                />
            )}
            <Modal isOpen={isModalOpen} onClose={closeModal} />
            </div>
        </section>
    )
    
}

