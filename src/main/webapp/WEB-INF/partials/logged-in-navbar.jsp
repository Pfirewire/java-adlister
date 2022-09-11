<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand" href="/ads">Adlister</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li>
        <form action="/ads/search-result" method="POST">
          <input id="searchBar" name="searchBar" type="text">
          <button type="submit" value="search">Search</button>
        </form>
      </li>
      <li><a href="/ads/create">Create an Ad</a></li>
      <li><a href="/logout">Logout</a></li>
    </ul>
  </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

