package com.example.avitointernapp.util

object Routes {
    const val HOME = "home"
    const val LOCAL_TRACKS = "local_tracks"
    const val API_TRACKS = "api_tracks"
    const val PLAYER = "player/{trackId}"

    fun playerRoute(trackId: String) = "player/$trackId"
}