/*
 * Copyright (C) 2017 Yaroslav Pronin <proninyaroslav@mail.ru>
 *
 * This file is part of LibreTorrent.
 *
 * LibreTorrent is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LibreTorrent is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LibreTorrent.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.proninyaroslav.libretorrent.core;

import android.os.Bundle;

import org.proninyaroslav.libretorrent.core.stateparcel.TorrentStateParcel;

public interface TorrentServiceCallback
{
    void onTorrentStateChanged(TorrentStateParcel state);
    void onTorrentsStateChanged(Bundle states);
    void onTorrentAdded(TorrentStateParcel state, Throwable exception);
    void onTorrentRemoved(TorrentStateParcel state);
}
