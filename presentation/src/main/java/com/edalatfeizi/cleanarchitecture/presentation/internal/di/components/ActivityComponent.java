package com.edalatfeizi.cleanarchitecture.presentation.internal.di.components;

import android.app.Activity;

import com.edalatfeizi.cleanarchitecture.presentation.internal.di.PerActivity;
import com.edalatfeizi.cleanarchitecture.presentation.internal.di.modules.ActivityModule;

import dagger.Component;

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 *
 * Subtypes of ActivityComponent should be decorated with annotation:
 * {@link com.edalatfeizi.cleanarchitecture.presentation.internal.di.PerActivity}
 */
//@PerActivity
//@Component( dependencies = ApplicationComponent.class, modules = ActivityModule.class)
//public interface ActivityComponent
//{
//    //Exposed to sub-graphs
//    Activity activity();
//}
