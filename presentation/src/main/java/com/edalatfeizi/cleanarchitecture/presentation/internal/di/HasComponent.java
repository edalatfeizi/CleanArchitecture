package com.edalatfeizi.cleanarchitecture.presentation.internal.di;

/**
 * Interface representing a contract for clients that contains a component for dependency injection
 * @param <C>
 */
public interface HasComponent<C>
{
    C getComponent();
}
