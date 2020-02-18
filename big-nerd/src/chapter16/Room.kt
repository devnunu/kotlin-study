package chapter16

open class Room(val name: String) {
    protected open val dangerLevel = 5
    var monster: Monster? = Goblin()

    fun description() = "Room: $name\nDanger level: $dangerLevel\nCreature: ${monster?.description ?: "none."}"

    open fun load() = "아무도 여기에 오지 않았습니다..."
}

class TownSquare : Room("Town Square") {
    override val dangerLevel: Int = super.dangerLevel - 3
    private var bellSound = "댕댕"

    final override fun load() = "당신의 참여를 주민들이 다 함꼐 환영합니다!"

    private fun ringBell() = "당신의 도착을 종탑에서 알립니다. $bellSound"
}