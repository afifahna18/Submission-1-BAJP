package com.afifah.movoruapp.utils

import android.content.Context
import android.widget.ImageView
import com.afifah.movoruapp.R
import com.afifah.movoruapp.data.DataEntity
import com.bumptech.glide.Glide

object DataTVShowDummy {
    const val TYPE_TVSHOW = "TYPE_TVSHOW"

    fun setGlideImage(context: Context, imagePath: Int, imageView: ImageView) {
        Glide.with(context).clear(imageView)
        Glide.with(context).load(imagePath).into(imageView)
    }

    fun generateDummyTVShow(): List<DataEntity> {

        val tvshow = ArrayList<DataEntity>()

        tvshow.add(
            DataEntity(
                "The Falcon and the Winter Soldier",
                "Mar 19, 2021",
                "50m",
                "Action & Adventure, Drama, War & Politics\n",
                "79%",
                R.drawable.the_falcon_and_the_winter,
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience."
            )
        )
        tvshow.add(
            DataEntity(
                "The Good Doctor",
                "Sep 25, 2017",
                "43m",
                "Drama",
                "86%",
                R.drawable.good_doctor,
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives"
            )
        )
        tvshow.add(
            DataEntity(
                "Lucifer",
                "Jan 25, 2016",
                "45m",
                "Crime, Sci-Fi & Fantasy\n",
                "85%",
                R.drawable.lucifer,
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape."
            )
        )
        tvshow.add(
            DataEntity(
                "Riverdale",
                "Jan 26, 2017",
                "45m",
                "Mystery, Drama, Crime",
                "86%",
                R.drawable.riverdale,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade."
            )
        )
        tvshow.add(
            DataEntity(
                "Game of Thrones",
                "Apr 17, 2011",
                "1h",
                "Sci-Fi & Fantasy, Drama, Action & Adventure",
                "84%",
                R.drawable.game_of_thrones,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond."
            )
        )
        tvshow.add(
            DataEntity(
                "Money Heist",
                "Mei 02, 2017",
                "1h 10m",
                "Crime, Drama",
                "83%",
                R.drawable.money_heist,
                "To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing."
            )
        )
        tvshow.add(
            DataEntity(
                "Friends",
                "Sep 22, 1994",
                "25m",
                "Comedy, Drama",
                "84%",
                R.drawable.friends,
                "The misadventures of a group of friends as they navigate the pitfalls of work, life and love in Manhattan."
            )
        )
        tvshow.add(
            DataEntity(
                "Chilling Adventures of Sabrina",
                "Okt 26, 2018",
                "1h",
                "Mystery, Sci-Fi & Fantasy, Drama",
                "84%",
                R.drawable.sabrina,
                "As her 16th birthday nears, Sabrina must choose between the witch world of her family and the human world of her friends. Based on the Archie comic."
            )
        )
        tvshow.add(
            DataEntity(
                "The Umbrella Academy",
                "Feb 15, 2019",
                "55m",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "87%",
                R.drawable.the_umbrella_academy,
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more."
            )
        )
        tvshow.add(
            DataEntity(
                "Tribes of Europa",
                "Feb 19, 2021",
                "47m",
                "Sci-Fi & Fantasy, Drama",
                "72%",
                R.drawable.tribes_of_europe,
                "2074. In the wake of a mysterious global disaster, war rages between the Tribes that have emerged from the wreckage of Europe. Three siblings from the peaceful Origine tribe are separated and forced to forge their own paths in an action-packed fight for the future of this new Europa."
            )
        )
        return tvshow
    }
}