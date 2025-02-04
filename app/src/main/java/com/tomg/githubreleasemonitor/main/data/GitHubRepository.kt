/*
 * Copyright (c) 2020-2022, Tom Geiselmann (tomgapplicationsdevelopment@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY,WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tomg.githubreleasemonitor.main.data

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tomg.githubreleasemonitor.Empty
import kotlinx.parcelize.Parcelize

@Keep
@Entity
@Parcelize
data class GitHubRepository(
    @PrimaryKey val id: String = String.Empty,
    val owner: String = String.Empty,
    val name: String = String.Empty,
    @ColumnInfo(name = "author_avatar_url") val authorAvatarUrl: String = String.Empty,
    @ColumnInfo(name = "author_html_url") val authorHtmlUrl: String = String.Empty,
    @ColumnInfo(name = "latest_release_html_url") val latestReleaseHtmlUrl: String = String.Empty,
    @ColumnInfo(name = "latest_release_name") val latestReleaseName: String = String.Empty,
    @ColumnInfo(name = "latest_release_timestamp") val latestReleaseTimestamp: String = String.Empty
) : Parcelable
