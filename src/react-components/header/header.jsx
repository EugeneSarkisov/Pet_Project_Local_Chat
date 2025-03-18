import React, { useState, useEffect, useRef } from 'react';
import { useNavigate } from 'react-router-dom';
import "./styles.css";

export const Header = ({}) => {

    const navigate = useNavigate();

    const handleHomeClick = () => {
        navigate('/');
    };

    return (     
        <header className = {`header`}>
            <div className = {`header-chatname`}> Малые Залупки CHAT </div>
            <button className={`header-home-button`} onClick={handleHomeClick}>
                Home
            </button>

        </header>

    )
}