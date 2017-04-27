package materializecsstaglibs

class MaterializeCardTagLib {

    /**
     * Creates a simple card for MaterializeCss<br/>
     *
     * &lt;g:materializeCard horizontal="true" title="title" text="text" controller="controller" action="action" itemId="itemId" itemLinkText="itemLinkText" /&gt;<br/>
     *
     * @emptyTag
     *
     * @attr horizontal
     * @attr title
     * @attr text REQUIRED
     * @attr itemId REQUIRED
     * @attr controller REQUIRED
     * @attr action REQUIRED
     * @attr itemLinkText REQUIRED
     * */
    def materializeCard = { Map attrsMap ->
        def str = ''
        if (attrsMap.horizontal.toString() == 'true') {
            str += '<div class="card horizontal">'
        } else {
            str += '<div class="card">'
        }
            str += '<div class="card-content">'
                if (attrsMap.title) {
                    str += '<span class="card-title truncate">' + attrsMap.title.toString() + '</span>'
                }
                str += '<p class="truncate">' + attrsMap.text.toString() + '</p>'
                str += '</div>'
                str += '<div class="card-action">'
                    str += '<a class="btn" href="/' + attrsMap.controller.toString() + '/' + attrsMap.action.toString() + '/' + attrsMap.itemId.toString() + '">' + attrsMap.itemLinkText.toString() + '</a>'
                str += '</div>'
            str += '</div>'
        out << str
    }

    /**
     * Creates a simple card for MaterializeCss<br/>
     *
     * &lt;g:materializeCard title="title" img="img" text="text" img="img" controller="controller" action="action" itemId="itemId" itemLinkText="itemLinkText" /&gt;<br/>
     *
     * @emptyTag
     *
     * @attr horizontal
     * @attr title
     * @attr img REQUIRED
     * @attr text REQUIRED
     * @attr itemId REQUIRED
     * @attr controller REQUIRED
     * @attr action REQUIRED
     * @attr itemLinkText REQUIRED
     * */
    def materializeCardImage = { Map attrsMap ->
        def str = ''
        if (attrsMap.horizontal.toString() == 'true') {
            str += '<div class="card horizontal">'
        } else {
            str += '<div class="card">'
        }
            str += '<div class="card-image">'
                str += '<img src="' + attrsMap.img.toString() + '">'
            if (attrsMap.title) {
                str += '<span class="card-title truncate">' + attrsMap.title.toString() + '</span>'
            }
            str += '</div>'
            str += '<div class="card-content">'
                str += '<p class="truncate">' + attrsMap.text.toString() + '</p>'
            str += '</div>'
            str += '<div class="card-action">'
                str += '<a class="btn" href="/' + attrsMap.controller.toString() + '/' + attrsMap.action.toString() + '/' + attrsMap.itemId.toString() + '">' + attrsMap.itemLinkText.toString() + '</a>'
            str += '</div>'
            str += '</div>'
        out << str
    }

}
