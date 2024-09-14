package com.example.foodorderapp.feature.location.ui.screen.components

data class LocationDetail(
    val suburb: String,
    val city: String,
    val state: String
)

val suburbs = listOf(
    "Surry Hills", "Paddington", "Newtown", "Bondi", "Manly",
    "Chatswood", "Parramatta", "Liverpool", "Cronulla", "Bankstown",
    "Blacktown", "Castle Hill", "Penrith", "Hornsby", "Fairfield",
    "Kogarah", "Hurstville", "Marrickville", "Mosman", "North Sydney",
    "Redfern", "Rose Bay", "Strathfield", "Woollahra", "Leichhardt",
    "Balmain", "Glebe", "Pyrmont", "Woolloomooloo", "Darlinghurst",
    "Ultimo", "Waterloo", "Zetland", "Coogee", "Randwick",
    "Kensington", "Kingsford", "Matraville", "Maroubra", "Bondi Beach",
    "Double Bay", "Elizabeth Bay", "Kings Cross", "Potts Point", "Rushcutters Bay",
    "Camperdown", "Drummoyne", "Erskineville", "Forest Lodge", "Haymarket",
    "Kirribilli", "Lavender Bay", "Lilyfield", "Milsons Point", "Neutral Bay",
    "Petersham", "Queens Park", "Rosebery", "St Peters", "Stanmore",
    "Summer Hill", "Sydenham", "Tempe", "Waverton", "Woolloomooloo",
    "Artarmon", "Ashfield", "Beaconsfield", "Birchgrove", "Beverly Hills",
    "Bexley", "Burwood", "Campsie", "Chippendale", "Crows Nest",
    "Darlington", "Dulwich Hill", "Eastgardens", "Enmore", "Five Dock",
    "Gladesville", "Greenwich", "Homebush", "Hunters Hill", "Lane Cove",
    "Lindfield", "McMahons Point", "Meadowbank", "Northbridge", "Roseville",
    "St Leonards", "Turramurra", "Wahroonga", "Waitara", "West Ryde"
)

val locations: List<LocationDetail> = suburbs.map { suburb ->
    LocationDetail(
        suburb = suburb,
        city = "Sydney",
        state = "NSW"
    )
}
