package materializecsstaglibs

class MaterializeCollectionTagLib {

    /**
     * Creates a list collection
     *
     * &lt;g:materializeCollection header="header" ids="ids" data="data"/&gt;<br/>
     *
     * @attr header
     * @attr ids REQUIRED
     * @attr data REQUIRED
     * @attr controller REQUIRED
     * @attr action REQUIRED
     */
    def materializeCollection = { Map attrsMap ->
        def str = ''
        if (attrsMap.header) {
            str += '<div class="collection with-header">'
            str += '<div class="collection-header">' + attrsMap.header.toString() + '</div>'
        } else {
            str += '<div class="collection">'
        }
        for (int i = 0; i < attrsMap.data.size(); i++) {
            str += '<a href="/' + attrsMap.controller.toString() + '/' + attrsMap.action.toString() + '/' + attrsMap.ids[i] + '" class="collection-item">' + attrsMap.data[i].toString() + '</a>'
        }
        str += '</div>'
        out << str
    }

}
