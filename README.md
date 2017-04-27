# MaterializeCSS TagLibs For Grails

##### This plugin contains TagLibs to use with MaterializeCSS as the FrontEnd CSS Framework.

`
maven {
    url  "http://dl.bintray.com/pablocloud/plugins" 
}
`

`
    compile 'com.pabloverdugo:MaterializeCsstagLibs:0.0.2'
`

### Current Features

---

#### Pagination

Use : 

`<g:materializePagination color="" total=""/>`

Attributes accepted : it uses the same attributes as 'g:paginate' plus color.

color values : All the Css classes inside MaterializeCSS.

---

#### Collections

Use : 

`<g:materializeCollection header="" controller="" action="" ids="" data=""/>`

* @attr header
* @attr ids REQUIRED
* @attr data REQUIRED
* @attr controller REQUIRED
* @attr action REQUIRED

---

#### Cards

Use : 

Without image : 

` <g:materializeCard itemId="" controller="" itemLinkText="" action="" text=""/>`

* @attr horizontal
* @attr title
* @attr text REQUIRED
* @attr itemId REQUIRED
* @attr controller REQUIRED
* @attr action REQUIRED
* @attr itemLinkText REQUIRED

With image : 

`<g:materializeCardImage itemId="" img="" controller="" itemLinkText="" action="" text=""/>`

* @attr horizontal
* @attr title
* @attr img REQUIRED
* @attr text REQUIRED
* @attr itemId REQUIRED
* @attr controller REQUIRED
* @attr action REQUIRED
* @attr itemLinkText REQUIRED