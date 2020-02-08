package com.github.arkronzxc.firebasegetstarted.service;

import com.github.arkronzxc.firebasegetstarted.model.UserModel;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FirebaseService {
    public String saveUserDetails(UserModel userModel) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("userModel")
                .document(userModel.getUserName()).set(userModel);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
}
