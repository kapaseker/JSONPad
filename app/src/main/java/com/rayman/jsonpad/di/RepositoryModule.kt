package com.rayman.jsonpad.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

//    @Provides
//    @Singleton
//    fun provideNoteRepository(noteDao: NoteDao): NoteRepository {
//        return NoteRepository(noteDao)
//    }
}
