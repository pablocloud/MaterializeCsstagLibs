package materializecsstaglibs

class MaterializeCollectionTagLib {

    def materializeCollection = { Map attrsMap ->
        def str = ''
        if (attrsMap.header) {
            str += '<div class="collection with-header">'
            str += '<div class="collection-header">' + attrsMap.header.toString() + '</div>'
        } else {
            str += '<div class="collection">'
        }
        attrsMap.data.each {
            str += '<a href="#" class="collection-item">' + it.toString() + '</a>'
        }
        str += '</div>'
        out << str
    }

}
