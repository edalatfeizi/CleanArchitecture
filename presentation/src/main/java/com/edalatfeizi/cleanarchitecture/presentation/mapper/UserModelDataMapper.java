package com.edalatfeizi.cleanarchitecture.presentation.mapper;

import com.edalatfeizi.cleanarchitecture.domain.User;
import com.edalatfeizi.cleanarchitecture.presentation.internal.di.PerActivity;
import com.edalatfeizi.cleanarchitecture.presentation.model.UserModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.inject.Inject;

/**
 * Mapper class used to transform {@link User} (in the domain layer) to {@link UserModel}
 * in the presentation layer.
 */
@PerActivity
public class UserModelDataMapper
{
    @Inject
    public UserModelDataMapper()
    {
    }

    /**
     * Transform a {@link User} into an {@link UserModel}
     *
     * @param user object to be transformed.
     * @return {@link UserModel}
     */
    public UserModel transform(User user)
    {
        if (user == null)
        {
            throw new IllegalArgumentException("Cannot transform a null value");
        }
        final UserModel userModel = new UserModel(user.getUserId());
        userModel.setCoverUrl(user.getCoverUrl());
        userModel.setFullName(user.getFullName());
        userModel.setDescription(user.getDescription());
        userModel.setFollowers(user.getFollowers());
        userModel.setEmail(user.getEmail());

        return userModel;
    }

    /**
     * Transform a collection of {@link User} into a collection of {@link UserModel}.
     *
     * @param usersCollection objects to be transformed.
     * @return list of {@link UserModel}
     */
    public Collection<UserModel> transform(Collection<User> usersCollection)
    {
        Collection<UserModel> userModelsCollection;

        if (usersCollection != null && !usersCollection.isEmpty())
        {
            userModelsCollection = new ArrayList<>();
            for (User user : usersCollection)
            {
                userModelsCollection.add(transform(user));
            }
        }else {
            userModelsCollection = Collections.emptyList();
        }
        return userModelsCollection;
    }
}
