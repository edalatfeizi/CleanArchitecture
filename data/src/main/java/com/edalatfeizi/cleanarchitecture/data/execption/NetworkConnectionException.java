package com.edalatfeizi.cleanarchitecture.data.execption;

/**
 * Exception throw by the application when there is a network connection exception
 */
public class NetworkConnectionException extends Exception
{
    public NetworkConnectionException(){
        super();
    }
    public NetworkConnectionException(final Throwable cause){
        super(cause);
    }
}
