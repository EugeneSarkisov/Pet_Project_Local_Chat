import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
 import "./styles.css";


 export const Signin = ({}) => {
    const [values, setValues] = useState({});
    const navigate = useNavigate();


    const handleChangeEmail = (event) => {
      setValues((prevState) => ({ ...prevState, email: event.target.value }));
    };
  
    const handleChangePass = (event) => {
      setValues((prevState) => ({ ...prevState, pass: event.target.value }));
    };

    console.log(values);

    const handleSuccess = () => {
      console.log('Login successful!');
      navigate('/success');
  };

  const handleTryAgain = () => {
      console.log('Please try again.');
      navigate('/tryagain');
  };

  const handleLoginInfo = () => {
      if (values.email && values.pass) {
          handleSuccess();
      } else {
          handleTryAgain();
      }
  };
  
     return (
        <section className="Signin"> 
        <div className="container_signin">
            <button href="#" onClick={() => navigate('/')} className="signin__back_to_home">
                Back to Home
            </button>
            <h2 className="signin__title">Sign In</h2>
            <div className="signin__wrapper">
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
        <button href="#" className="signin__forgotpass">Forgot Password?</button>

        <button href="#" onClick={handleLoginInfo} className="signin__signin">Sign In!</button>
        <div className="signup">Dont have an account? <button href="#" className="signup__button" onClick={() => navigate('/signup')}>Sign up!</button>
        </div>
            </div>
        </div>
        </section>  
     )
 }

 export const Success =({ }) =>{
    const navigate = useNavigate();
    return(
    <section className="Success">
    <div className="container_signin">
              <button href="#" onClick={() => navigate('/')} className="signin__back_to_home">
                  Back to Home
              </button>
              <h2 className="signin__title">Success</h2>
              <div className="signin__wrapper">
                <div className="success_title"> Your Sign Up is complete. 
                  Have fun!</div>
              <button href="#" onClick={() => navigate('/')} className="go_to_home">
                  Go to Home
              </button>
              </div>
              </div>
      </section> )
  }

 export const Tryagain =({  }) =>{
    const navigate = useNavigate();
    return(
    <section className="Tryagain">
    <div className="container_signin">
              <button href="#" onClick={() => navigate('/')} className="signin__back_to_home">
                  Back to Home
              </button>
              <h2 className="signin__title">Error!</h2>
              <div className="signin__wrapper">
                <div className="success_title"> Sign Up is not complete. Please, try again.</div>
              <button href="#" onClick={() => navigate('/signin')} className="go_to_home">
                  Try Again?
              </button>
              </div>
              </div>
      </section> 
     )
  }