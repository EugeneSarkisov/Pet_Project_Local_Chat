import React, { useState, useEffect } from "react";
import  "./styles.css";
import { useNavigate } from 'react-router-dom';
import { Tryagain } from "../sign-in/sign-in"



export const SignUp = ({ }) =>{
    const [values, setValues] = useState({});
       const navigate = useNavigate();

    const handleChangeName = (event) => {
        setValues((prevState) => ({ ...prevState, name: event.target.value }));
      };

    const handleChangeEmail = (event) => {
      setValues((prevState) => ({ ...prevState, email: event.target.value }));
    };
  
    const handleChangePass = (event) => {
      setValues((prevState) => ({ ...prevState, pass: event.target.value }));
    };
    
    const handleConfirmPass = (event) => {
        setValues((prevState) => ({ ...prevState, confirmpass: event.target.value }));
      };

    console.log(values);

    const handleSuccess = () => {
      console.log('signup successful!');
      navigate('/confirmation');
  };

  const handleTryAgain = () => {
      console.log('Please try again.');
      navigate('/tryagain');
  };

  const handleLoginInfo = () => {
      if (values.name && values.email && values.pass && values.confirmpass) {
          handleSuccess();
      } else {
          handleTryAgain();
      }
  };

    return(
      <React.Fragment>
        <section className="SignUp"> 
        <div className="container_signin">
            <button href="#" onClick={() => navigate('/')} className="signin__back_to_home">
                Back to Home
            </button>
            <h2 className="signin__title">Sign Up</h2>
            <div className="signin__wrapper">
            <label htmlFor="signin__name">Name</label>
        <input 
          type="text"
          className="signin__input"
          id="signin__name"
           placeholder="Name"
          onInput={handleChangeName}
        />
            <label htmlFor="signin__email">Email</label>
        <input 
          type="text"
          className="signin__input"
          id="signin__email"
           placeholder="Email"
          onInput={handleChangeEmail}
        />
        <label htmlFor="signin__pass">Password</label>
        <input
          type="text"
          className="signin__input"
          id="signinPass"
          placeholder="Password"
          onInput={handleChangePass}
        />
            <label htmlFor="signin__pass"> Confirm Password</label>
        <input
          type="text"
          className="signin__input"
          id="signinPass"
          placeholder="Password"
          onInput={handleConfirmPass}
        />
        {/* <button href="#" className="signin__forgotpass">Forgot Password?</button> */}

        <button href="#" onClick={handleLoginInfo} className="signin__signin">Sign Up!</button>
        <div className="signup">Already have an account? <button href="#" className="signup__button" onClick={() => navigate('/signin')}>Sign in!</button>
        </div>
            </div>
        </div>
        </section>  
        </React.Fragment>
    )
}

export const Confirmation =({ }) =>{
  const navigate = useNavigate();
  return(
  <section className="Confirmation">
  <div className="container_signin">
            <button href="#" onClick={() => navigate('/')} className="signin__back_to_home">
                Back to Home
            </button>
            <h2 className="signin__title">Confirm your email!</h2>
            <div className="signin__wrapper">
              <div className="success_title"> Confirmation message was sent to your email. Please, check your mailbox.</div>
            <button href="#" onClick={() => navigate('/')} className="go_to_home">
                Go to Home
            </button>
            </div>
            </div>
    </section> )
}
