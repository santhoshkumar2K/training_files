enum Degree
{
    PG("PG"),UG("UG"),PhD("PhD");
    String type;
    Degree(String type)
    {
        this.type=type;
    }
    public String toString()
    {
        return this.type;
    }
}
