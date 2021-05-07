package com.afifah.movoruapp.utils

import android.content.Context
import android.widget.ImageView
import com.afifah.movoruapp.R
import com.afifah.movoruapp.data.DataEntity
import com.bumptech.glide.Glide

object DataMoviesDummy {

    const val TYPE_MOVIE = "TYPE_MOVIE"

    fun setGlideImage(context: Context, imagePath: Int, imageView: ImageView) {
        Glide.with(context).clear(imageView)
        Glide.with(context).load(imagePath).into(imageView)
    }

    fun generateDummyMovies(): List<DataEntity> {

        val movie = ArrayList<DataEntity>()

        movie.add(
            DataEntity(
                "Harry Potter and the Philosopher's Stone",
                "Nov 16, 2001",
                "2h 32m",
                "Adventure, Fantasy",
                "79%",
                R.drawable.harry_potter,
                "Harry Potter has lived under the stairs at his aunt and uncle's house his whole life. But on his 11th birthday, he learns he's a powerful wizard -- with a place waiting for him at the Hogwarts School of Witchcraft and Wizardry. As he learns to harness his newfound powers with the help of the school's kindly headmaster, Harry uncovers the truth about his parents' deaths -- and about the villain who's to blame"
            )
        )
        movie.add(
            DataEntity(
                "Twist",
                "Jan 22, 2021",
                "1h 30m",
                "Crime, Drama, Action",
                "71%",
                R.drawable.twist,
                "A Dickens classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday."
            )
        )
        movie.add(
            DataEntity(
                "Joker",
                "Okt 02, 2019",
                "2h 2m",
                "Crime, Thriller, Drama",
                "82%",
                R.drawable.joker,
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure."
            )
        )
        movie.add(
            DataEntity(
                "Avengers: Infinity War",
                "Apr 25, 2018",
                "2h 29m",
                "Adventure, Action, Science Fiction",
                "83%",
                R.drawable.avengers_infinity_war,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
            )
        )
        movie.add(
            DataEntity(
                "Roald Dahl's The Witches",
                "Okt 25, 2020",
                "1h 46m",
                "Family, Fantasy, Adventure, Comedy, Horror",
                "67%",
                R.drawable.roald_dahl_witches,
                "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has gathered."
            )
        )
        movie.add(
            DataEntity(
                "Red Shoes And The Seven Dwarfs",
                "Jul 25, 2019",
                "1h 32m",
                "Animation, Romance, Family",
                "76%",
                R.drawable.red_shoes,
                "Princes who have been turned into Dwarfs seek the red shoes of a lady in order to break the spell, although it will not be easy."
            )
        )
        movie.add(
            DataEntity(
                "Coco",
                "Okt 27, 2017",
                "1h 45m",
                "Family, Animation, Fantasy, Music, Comedy, Adventure",
                "82%",
                R.drawable.coco,
                "Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history."
            )
        )
        movie.add(
            DataEntity(
                "Toy Story 4",
                "Jun 19, 2019",
                "1h 40m",
                "Adventure, Animation, Comedy, Family, Fantasy, Drama",
                "76%",
                R.drawable.toy_story_4,
                "Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy."
            )
        )
        movie.add(
            DataEntity(
                "They Live Inside Us",
                "Okt 06, 2020",
                "1h 43m",
                "Horror",
                "58%",
                R.drawable.they_live_inside_us,
                "Seeking inspiration for a new writing project, a man spends Halloween night in a notoriously haunted house. He soon realizes he is living in his own horror story."
            )
        )
        movie.add(
            DataEntity(
                "The Secret Life of Pets 2",
                "Mei 24, 2019",
                "1h 26m",
                "Adventure, Animation, Comedy, Family\n",
                "70%",
                R.drawable.pets2,
                "Max the terrier must cope with some major life changes when his owner gets married and has a baby. When the family takes a trip to the countryside, nervous Max has numerous run-ins with canine-intolerant cows, hostile foxes and a scary turkey. Luckily for Max, he soon catches a break when he meets Rooster, a gruff farm dog who tries to cure the lovable pooch of his neuroses."
            )
        )
        return movie
    }
}