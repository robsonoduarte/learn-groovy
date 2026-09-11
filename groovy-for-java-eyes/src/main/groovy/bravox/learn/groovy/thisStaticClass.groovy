package bravox.learn.groovy

class Query{
    static List query = []

    static select(fields) {
        query << "SELECT $fields"
        this
    }

    static from(table) {
        query << "FROM $table"
        this
    }

    static where(cond) {
        query << "WHERE $cond"
        this
    }

    static String build() {
        return query.join(" ")
    }
}

def query = Query.select('*')
        .from('USERS')
        .where('ID = 1')
        .build()

print query

