import React, { useEffect } from 'react'
import { useState } from 'react'
import { wait } from './Helper'

const useTypedMessage = (message) => {

    const [typedMessage, setTypedMessage] = useState(" ");

useEffect(() => {
    setTypedMessage(' ');
    if (message.length){
        (async ()=> {
            let visibleMessage = '';

            for(let i = 0; i < message.length; i++){
                await wait(25);
                visibleMessage = visibleMessage + message[i];
                setTypedMessage(visibleMessage);
            }
        })();
    }

}, [message]);

  return typedMessage;
    
}

export default useTypedMessage