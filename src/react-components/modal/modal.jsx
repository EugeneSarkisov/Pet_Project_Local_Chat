import React from 'react';
import './styles.css'; 

export const Modal = ({ isOpen, onClose }) => {
    if (!isOpen) return null;

    const handleOverlayClick = (e) => {
        if (e.target === e.currentTarget) {
            onClose();
        }
    };

    return (
        <div className="modal-overlay" onClick={handleOverlayClick}>
            <div className="modal-content">
                <h2 className='modal-name'>Создать чат</h2>
                <div className='modal-set-name'> Название чата: 
                    <input className='modal-set-name-input' placeholder='Введите название...'></input>
                </div>
                <div className='modal-set-members'>Количество участников:
                    <input className='modal-set-members-input' type='number' placeholder='Введите количество...'></input>
                </div>
                <button onClick={onClose}> Х </button>
            </div>
        </div>
    );
};
