package net.erdii.apps.useful_quicksettings

import android.app.Service
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.provider.AlarmClock.ACTION_SHOW_TIMERS
import android.service.quicksettings.TileService
import android.widget.Toast
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
class ListAlarmsTileService : TileService() {
    override fun onClick() {
        super.onClick()

        val calendarIntent = Intent(ACTION_SHOW_TIMERS)
        calendarIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        startActivityAndCollapse(calendarIntent)
    }

    override fun onTileRemoved() {
        super.onTileRemoved()

        // Do something when the user removes the Tile
    }

    override fun onTileAdded() {
        super.onTileAdded()

        // Do something when the user add the Tile
    }

    override fun onStartListening() {
        super.onStartListening()

        // Called when the Tile becomes visible
    }

    override fun onStopListening() {
        super.onStopListening()

        // Called when the tile is no longer visible
    }}
