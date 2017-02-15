Singletons


class SodaFiller{
  private static SodaFiller sodaFiller = null;
    public static SodaFiller getInstance(){
    if(sodaFiller == null) sodaFiller = new SodaFiller();
    return SodaFiller;
    }
    public void fillBottle(SodaBottle)
}

SodaFiller sodaFiller = SodaFiller.getInstance();
SodaFiller odaFillerOther = SodaFiller.getInstance();
assert(SodaFiller == SodaFillerOther)

SodaFiller.fillBottle(new SodaBottle
