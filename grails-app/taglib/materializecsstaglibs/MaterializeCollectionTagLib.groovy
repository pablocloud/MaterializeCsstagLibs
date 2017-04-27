package materializecsstaglibs

class MaterializeCollectionTagLib {

    def materializeCollection = { Map attrsMap ->
        def str = ''
        str += '<div class="collection">'
        attrsMap.data.each {
            str += '<a href="#" class="collection-item">' + it.toString() + '</a>'
        }
        str += '</div>'
        out << str
    }

}
